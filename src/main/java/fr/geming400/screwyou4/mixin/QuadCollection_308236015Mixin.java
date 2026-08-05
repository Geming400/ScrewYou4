package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.geometry.QuadCollection.class)
public class QuadCollection_308236015Mixin {
        @Inject(at = @At("HEAD"), method = "getAll()Ljava/util/List;", cancellable = true)
    private void getAll_1934572830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934572830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMaterialFlag(I)Z", cancellable = true)
    private void hasMaterialFlag_1522156830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522156830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "materialFlags()I", cancellable = true)
    private void materialFlags_346498260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(346498260L))
            info.setReturnValue(1062497580);
    }

    @Inject(at = @At("HEAD"), method = "getQuads(Lnet/minecraft/core/Direction;)Ljava/util/List;", cancellable = true)
    private void getQuads__1182654062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182654062L))
            info.setReturnValue(null);
    }


}
