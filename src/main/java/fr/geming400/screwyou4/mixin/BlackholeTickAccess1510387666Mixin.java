package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.BlackholeTickAccess.class)
public class BlackholeTickAccess1510387666Mixin {
        @Inject(at = @At("HEAD"), method = "emptyLevelList()Lnet/minecraft/world/ticks/LevelTickAccess;", cancellable = true)
    private static void emptyLevelList__1311231874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311231874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyContainer()Lnet/minecraft/world/ticks/TickContainerAccess;", cancellable = true)
    private static void emptyContainer__1806636260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806636260L))
            info.setReturnValue(null);
    }


}
