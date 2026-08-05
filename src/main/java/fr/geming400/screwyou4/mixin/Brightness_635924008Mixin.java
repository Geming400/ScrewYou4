package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.MapColor.Brightness.class)
public class Brightness_635924008Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void values__801485502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801485502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void valueOf__1861658679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861658679L))
            info.setReturnValue(net.minecraft.world.level.material.MapColor.Brightness.LOW);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void byId_1655601856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655601856L))
            info.setReturnValue(net.minecraft.world.level.material.MapColor.Brightness.HIGH);
    }


}
