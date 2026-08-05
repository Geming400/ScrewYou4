package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiSection.class)
public class PoiSection1496873579Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void remove__1701347722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1701347722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void add__1493661182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1493661182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getType_39953429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39953429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void release__773055427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773055427L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "exists(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void exists_1056794337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056794337L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__725247376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725247376L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "refresh(Ljava/util/function/Consumer;)V", cancellable = true)
    private void refresh__1362488605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1362488605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/village/poi/PoiSection$Packed;", cancellable = true)
    private void pack_1413881321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413881321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecords(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getRecords_2115073266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115073266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFreeTickets(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getFreeTickets_1679669898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679669898L))
            info.setReturnValue(-689887856);
    }

    @Inject(at = @At("HEAD"), method = "getDebugPoiInfo(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getDebugPoiInfo_354006506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354006506L))
            info.setReturnValue(null);
    }


}
