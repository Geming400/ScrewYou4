package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Leashable.LeashData.class)
public class LeashData_1900130780Mixin {
        @Inject(at = @At("HEAD"), method = "setLeashHolder(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setLeashHolder__1916402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1916402L))
            info.cancel();
    }


}
