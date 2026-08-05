package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLayerInfo.class)
public class FlatLayerInfo_1508941480Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_373481008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373481008L))
            info.setReturnValue("\uD40C=");
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1547203725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547203725L))
            info.setReturnValue(-937878141);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__786817387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786817387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightLimited(I)Lnet/minecraft/world/level/levelgen/flat/FlatLayerInfo;", cancellable = true)
    private void heightLimited_1258001773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258001773L))
            info.setReturnValue(null);
    }


}
