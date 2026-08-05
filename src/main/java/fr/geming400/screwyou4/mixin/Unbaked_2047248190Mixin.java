package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Unbaked.class)
public class Unbaked_2047248190Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__511865383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511865383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__862206848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862206848L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_911788214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911788214L))
            info.setReturnValue("8쇾h桚=긫ᐩ穇04a幫$B;<wC@ꔩs$HRGn&z鋂㑤qxoxulcnA4ӘWqgTI64)|q觕<ꄜ≸ⳗ/M%swVm1nA^<홑Vtw}X!2햘D-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2085510931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085510931L))
            info.setReturnValue(-759824496);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_359096369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(359096369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/client/renderer/special/EndCubeSpecialRenderer$Type;", cancellable = true)
    private void effect_1275659585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275659585L))
            info.setReturnValue(net.minecraft.client.renderer.special.EndCubeSpecialRenderer.Type.PORTAL);
    }


}
