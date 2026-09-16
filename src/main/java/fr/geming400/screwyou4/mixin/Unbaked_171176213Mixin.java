package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ShieldSpecialRenderer.Unbaked.class)
public class Unbaked_171176213Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1224074442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224074442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__737450056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737450056L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_941599737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941599737L))
            info.setReturnValue("`J%wMc]L8Rm\uC766;F2\uC74F3nM](6']|JW?\u3C92\uBCEC/j9,\u78EB^KccajI_;$p@\u40D3\u8C08di^\u235FWYxJ\u2F77Ga6)H8UK,fIWy(39\u4649[PN\u3000\u3898 #IT/G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_728528303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(728528303L))
            info.setReturnValue(541715935);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1343978593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343978593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ShieldSpecialRenderer;", cancellable = true)
    private void bake_1660832723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660832723L))
            info.setReturnValue(null);
    }


}
