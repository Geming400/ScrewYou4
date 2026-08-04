package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.DragonFlightHistory.class)
public class DragonFlightHistory1100908259Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void get_1130809120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130809120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(IF)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void get_2146717308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146717308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "record(DF)V", cancellable = true)
    private void record__40887528(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-40887528L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory;)V", cancellable = true)
    private void copyFrom__934533129(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934533129L))
            info.cancel();
    }


}
