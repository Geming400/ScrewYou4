package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostChainConfig.TextureInput.class)
public class TextureInput_2073268786Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__836186252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-836186252L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_937808810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937808810L))
            info.setReturnValue("Q\u4677[ez:Xh&mp`px};\u35C9y3'\uACDDxZ%CG,\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2111531527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531527L))
            info.setReturnValue(-2118161174);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__369797768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369797768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_2111531031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531031L))
            info.setReturnValue(-1915013755);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_2111531031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531031L))
            info.setReturnValue(-1915013755);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_2111547368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111547368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/Set;", cancellable = true)
    private void referencedTargets_244233299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244233299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName_937808314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937808314L))
            info.setReturnValue("j\uBB78,0\uB5C8 n!1i\u1E9B.\u5D50%0MM\u8E8Ep\u205ABBxCw)&/d@v;#Qp\u4EB4");
    }


}
