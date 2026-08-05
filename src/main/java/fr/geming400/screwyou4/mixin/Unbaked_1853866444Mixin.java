package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ConduitSpecialRenderer.Unbaked.class)
public class Unbaked_1853866444Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__705247129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705247129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1055588594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055588594L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_718406468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718406468L))
            info.setReturnValue("=\u7DBCwjmTG;0\"#r9M3tpShA\u5D4C\uB43F}\u8185O$;)px5]:W\uD716OVjePHWd>>'Tz2G!\uCA35$(n H+#3yt&Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1892129185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892129185L))
            info.setReturnValue(236347190);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_165843583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165843583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ConduitSpecialRenderer;", cancellable = true)
    private void bake__1310328972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310328972L))
            info.setReturnValue(null);
    }


}
