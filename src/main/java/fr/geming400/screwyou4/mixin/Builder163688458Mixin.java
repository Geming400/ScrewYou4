package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.syncher.SynchedEntityData.Builder.class)
public class Builder163688458Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/network/syncher/SynchedEntityData;", cancellable = true)
    private void build__1747423983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747423983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "define(Lnet/minecraft/network/syncher/EntityDataAccessor;Ljava/lang/Object;)Lnet/minecraft/network/syncher/SynchedEntityData$Builder;", cancellable = true)
    private void define__1638147942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638147942L))
            info.setReturnValue(null);
    }


}
