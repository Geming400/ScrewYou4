package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.OverworldBiomeBuilder.class)
public class OverworldBiomeBuilder2137693275Mixin {
        @Inject(at = @At("HEAD"), method = "getDebugStringForTemperature(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForTemperature__1977796752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977796752L))
            info.setReturnValue("\uC5EAc\uB27EQ<\u3AB0=!I.%rcNq4\u11C0-m[Qs7\u49CCOo4\u8AC7se1&Wy6C\uD736bw^6\u40C3OQ<Xg.,\u33CFs\uA8BD7:(\uA72ACc\uB34A!1#J\uAEE91\u92FC]r");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForPeaksAndValleys(D)Ljava/lang/String;", cancellable = true)
    private static void getDebugStringForPeaksAndValleys__1977796504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977796504L))
            info.setReturnValue("O\u00C7F@JM0m");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForContinentalness(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForContinentalness__1977796752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977796752L))
            info.setReturnValue("\uC5EAc\uB27EQ<\u3AB0=!I.%rcNq4\u11C0-m[Qs7\u49CCOo4\u8AC7se1&Wy6C\uD736bw^6\u40C3OQ<Xg.,\u33CFs\uA8BD7:(\uA72ACc\uB34A!1#J\uAEE91\u92FC]r");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForErosion(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForErosion__1977796752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977796752L))
            info.setReturnValue("\uC5EAc\uB27EQ<\u3AB0=!I.%rcNq4\u11C0-m[Qs7\u49CCOo4\u8AC7se1&Wy6C\uD736bw^6\u40C3OQ<Xg.,\u33CFs\uA8BD7:(\uA72ACc\uB34A!1#J\uAEE91\u92FC]r");
    }

    @Inject(at = @At("HEAD"), method = "getDebugStringForHumidity(D)Ljava/lang/String;", cancellable = true)
    private void getDebugStringForHumidity__1977796752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977796752L))
            info.setReturnValue("\uC5EAc\uB27EQ<\u3AB0=!I.%rcNq4\u11C0-m[Qs7\u49CCOo4\u8AC7se1&Wy6C\uD736bw^6\u40C3OQ<Xg.,\u33CFs\uA8BD7:(\uA72ACc\uB34A!1#J\uAEE91\u92FC]r");
    }

    @Inject(at = @At("HEAD"), method = "getTemperatureThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getTemperatureThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDeepDarkRegion(Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction;Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)Z", cancellable = true)
    private static void isDeepDarkRegion__50573991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50573991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHumidityThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getHumidityThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeirdnessThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getWeirdnessThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getErosionThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getErosionThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnTarget()Ljava/util/List;", cancellable = true)
    private void spawnTarget__530937205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530937205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPeaksAndValleysThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getPeaksAndValleysThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContinentalnessThresholds()[Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void getContinentalnessThresholds__748543321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748543321L))
            info.setReturnValue(null);
    }


}
