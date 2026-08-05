package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.SpatialLongSet.class)
public class SpatialLongSet638783368Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_677045614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677045614L))
            info.setReturnValue(-481466421);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_677061951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677061951L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(J)Z", cancellable = true)
    private void add_1853627705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853627705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rem(J)Z", cancellable = true)
    private void rem_1853627705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853627705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeFirstLong()J", cancellable = true)
    private void removeFirstLong_677046575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677046575L))
            info.setReturnValue(-320624114392140026L);
    }


}
