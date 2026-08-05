package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.StatsCounter.class)
public class StatsCounter355909041Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/stats/StatType;Ljava/lang/Object;)I", cancellable = true)
    private void getValue_793527568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793527568L))
            info.setReturnValue(-1517006501);
    }

    @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/stats/Stat;)I", cancellable = true)
    private void getValue__1151551026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151551026L))
            info.setReturnValue(-1856485855);
    }

    @Inject(at = @At("HEAD"), method = "increment(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void increment__466868693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-466868693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/stats/Stat;I)V", cancellable = true)
    private void setValue__466868693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-466868693L))
            info.cancel();
    }


}
