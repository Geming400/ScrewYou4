package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.SingleVariant.Unbaked.class)
public class Unbaked717448533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__191177735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-191177735L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1487872058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487872058L))
            info.setReturnValue("%\u5D1E^\uC9DB)\u8F73On\"B\uCBA3\uCF3A\u4A9BKn(kG[ Q'\u035A^M Da`B/\u3EDAD;-\uA989B2a\"@%G@)+/72M\u0568<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1274800624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274800624L))
            info.setReturnValue(-378287584);
    }

    @Inject(at = @At("HEAD"), method = "variant()Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void variant__1540272486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540272486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1793138816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1793138816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake_1721325941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721325941L))
            info.setReturnValue(null);
    }


}
