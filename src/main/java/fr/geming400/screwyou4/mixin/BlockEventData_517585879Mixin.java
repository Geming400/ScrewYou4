package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.BlockEventData.class)
public class BlockEventData_517585879Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1903098137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903098137L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__617874097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617874097L))
            info.setReturnValue("Y:YSc'!b:l2g)8,\"(斥$'G洆AkLoପNH,XbA9$gT?⋮l;鶎PaBQDW_6|9/kV獤f&@<q@䐰EuH||p&A7qiJ4M=>bA}BA9z餤 @@Cw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_555848620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555848620L))
            info.setReturnValue(-352207614);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1375801001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1375801001L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void block__239679221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-239679221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paramB()I", cancellable = true)
    private void paramB_555848124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555848124L))
            info.setReturnValue(-149060195);
    }

    @Inject(at = @At("HEAD"), method = "paramA()I", cancellable = true)
    private void paramA_555848124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555848124L))
            info.setReturnValue(-149060195);
    }


}
