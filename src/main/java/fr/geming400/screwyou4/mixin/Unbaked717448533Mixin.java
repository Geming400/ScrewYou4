package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.SingleVariant.Unbaked.class)
public class Unbaked717448533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2102960792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2102960792L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__418011442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418011442L))
            info.setReturnValue("\uA60E5\"/+69(p$\uBDE8\u5E47lK*)=;Y;y+\uA56BNfv,#-i\uC301L\u8D19:%34U=5\uB2F1-6fIj\u350Bn\u6623C3'EE<v<h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_755711275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755711275L))
            info.setReturnValue(-1528510051);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void variant__652943787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-652943787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__1307026450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307026450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_667654603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(667654603L))
            info.cancel();
    }


}
