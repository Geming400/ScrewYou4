package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.DragonFlightHistory.class)
public class DragonFlightHistory1100908259Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void get__1206975606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1206975606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(IF)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void get__1605132462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605132462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "record(DF)V", cancellable = true)
    private void record_1471635879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1471635879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyFrom(Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory;)V", cancellable = true)
    private void copyFrom_989748598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(989748598L))
            info.cancel();
    }


}
