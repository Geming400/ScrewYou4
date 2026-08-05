package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeaconBeamOwner.Section.class)
public class Section_1122173285Mixin {
        @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1160435530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160435530L))
            info.setReturnValue(-1425780157);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_1160435530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160435530L))
            info.setReturnValue(-1425780157);
    }

    @Inject(at = @At("HEAD"), method = "increaseHeight()V", cancellable = true)
    private void increaseHeight_1160448023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1160448023L))
            info.cancel();
    }


}
