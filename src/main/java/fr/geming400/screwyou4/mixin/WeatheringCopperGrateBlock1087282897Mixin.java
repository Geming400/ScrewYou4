package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperGrateBlock.class)
public class WeatheringCopperGrateBlock1087282897Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__973662358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973662358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_1674466809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674466809L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }


}
