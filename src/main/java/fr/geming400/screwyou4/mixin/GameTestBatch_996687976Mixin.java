package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestBatch.class)
public class GameTestBatch_996687976Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1034950221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034950221L))
            info.setReturnValue(1422173730);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1912767062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912767062L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__138772000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-138772000L))
            info.setReturnValue("ভt$>些Tyr!cXTSs霘=BC缔F@k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1034950717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034950717L))
            info.setReturnValue(-1475385560);
    }

    @Inject(at = @At("HEAD"), method = "environment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void environment__1749403549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749403549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameTestInfos()Ljava/util/Collection;", cancellable = true)
    private void gameTestInfos__816960297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816960297L))
            info.setReturnValue(null);
    }


}
