package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.DecoratedPotSpecialRenderer.Unbaked.class)
public class Unbaked_220174506Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1175076149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175076149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__688451763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688451763L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_990598030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990598030L))
            info.setReturnValue("\u6AE5\u6F78Mu;rfvXY8& t1B2,#5omw!N\",FYxS#\u337F\"DYX(%)R^\uB5F3C5g+Z+\u590C\u31CAj%TVW:=K ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_777526596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777526596L))
            info.setReturnValue(741311865);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1392976886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392976886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/DecoratedPotSpecialRenderer;", cancellable = true)
    private void bake__2120600099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120600099L))
            info.setReturnValue(null);
    }


}
