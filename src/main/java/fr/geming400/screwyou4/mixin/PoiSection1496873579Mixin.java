package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiSection.class)
public class PoiSection1496873579Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void remove_1665640178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1665640178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void add_634716291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634716291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getType__625726011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625726011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void release_1665644022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665644022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "exists(Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;)Z", cancellable = true)
    private void exists__995601787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995601787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1535152162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535152162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refresh(Ljava/util/function/Consumer;)V", cancellable = true)
    private void refresh__2117077304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2117077304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/village/poi/PoiSection$Packed;", cancellable = true)
    private void pack_490337506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490337506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRecords(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/village/poi/PoiManager$Occupancy;)Ljava/util/stream/Stream;", cancellable = true)
    private void getRecords__421124482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421124482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFreeTickets(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getFreeTickets_1665627685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665627685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDebugPoiInfo(Lnet/minecraft/core/BlockPos;)Ljava/util/Optional;", cancellable = true)
    private void getDebugPoiInfo__625726011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625726011L))
            info.setReturnValue(null);
    }


}
