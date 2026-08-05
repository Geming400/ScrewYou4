package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ClassTreeIdRegistry.class)
public class ClassTreeIdRegistry1810737440Mixin {
        @Inject(at = @At("HEAD"), method = "getCount(Ljava/lang/Class;)I", cancellable = true)
    private void getCount_1710548793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710548793L))
            info.setReturnValue(-1866514750);
    }

    @Inject(at = @At("HEAD"), method = "define(Ljava/lang/Class;)I", cancellable = true)
    private void define_1710548793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710548793L))
            info.setReturnValue(-1866514750);
    }

    @Inject(at = @At("HEAD"), method = "getLastIdFor(Ljava/lang/Class;)I", cancellable = true)
    private void getLastIdFor_1710548793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1710548793L))
            info.setReturnValue(-1866514750);
    }


}
