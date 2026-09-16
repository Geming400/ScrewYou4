package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.lighting.SpatialLongSet.class)
public class SpatialLongSet638783368Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1082514957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082514957L))
            info.setReturnValue(-1494987113);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1697899740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697899740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "add(J)Z", cancellable = true)
    private void add__632366822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632366822L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "rem(J)Z", cancellable = true)
    private void rem__153912749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153912749L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removeFirstLong()J", cancellable = true)
    private void removeFirstLong__1671646969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1671646969L))
            info.setReturnValue(-1087244005738415529L);
    }


}
