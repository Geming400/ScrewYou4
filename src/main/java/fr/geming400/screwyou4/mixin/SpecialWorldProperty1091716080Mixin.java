package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.class)
public class SpecialWorldProperty1091716080Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private static void values_1594226781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594226781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/PrimaryLevelData$SpecialWorldProperty;", cancellable = true)
    private static void valueOf__937525632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937525632L))
            info.setReturnValue(net.minecraft.world.level.storage.PrimaryLevelData.SpecialWorldProperty.DEBUG);
    }


}
