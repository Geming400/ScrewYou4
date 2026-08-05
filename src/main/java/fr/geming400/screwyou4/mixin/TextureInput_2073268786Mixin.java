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
            info.setReturnValue("Q䙷[ez:Xh&mp`px};㗉y3'곝xZ%CG,\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2111531527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531527L))
            info.setReturnValue(-1768345174);
    }

    @Inject(at = @At("HEAD"), method = "location()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void location__369797768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369797768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_2111531031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531031L))
            info.setReturnValue(-1565197755);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_2111531031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111531031L))
            info.setReturnValue(-1565197755);
    }

    @Inject(at = @At("HEAD"), method = "referencedTargets()Ljava/util/Set;", cancellable = true)
    private void referencedTargets_244233299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244233299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName_937808314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937808314L))
            info.setReturnValue("j뭸,0뗈 n!1iẛ.嵐%0MM躎p⁚BBxCw)&/d@v;#Qp亴");
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_2111547368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111547368L))
            info.setReturnValue(true);
    }


}
