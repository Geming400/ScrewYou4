package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.Sound.Type.class)
public class Type1011450649Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/resources/sounds/Sound$Type;", cancellable = true)
    private static void values_974261240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(974261240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/resources/sounds/Sound$Type;", cancellable = true)
    private static void valueOf__1146687179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146687179L))
            info.setReturnValue(net.minecraft.client.resources.sounds.Sound.Type.FILE);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/client/resources/sounds/Sound$Type;", cancellable = true)
    private static void getByName__1146687179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146687179L))
            info.setReturnValue(net.minecraft.client.resources.sounds.Sound.Type.FILE);
    }


}
