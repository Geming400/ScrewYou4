package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Cloner.class)
public class Cloner_1117116927Mixin {
        @Inject(at = @At("HEAD"), method = "clone(Ljava/lang/Object;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/core/HolderLookup$Provider;)Ljava/lang/Object;", cancellable = true)
    private void clone__1583233118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583233118L))
            info.setReturnValue(new java.lang.Object());
    }


}
