package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariants.SoundSet.class)
public class SoundSet1623792164Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariants$SoundSet;", cancellable = true)
    private static void values__325776328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-325776328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/wolf/WolfSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf__477497519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477497519L))
            info.setReturnValue(net.minecraft.world.entity.animal.wolf.WolfSoundVariants.SoundSet.ANGRY);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__1294996212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1294996212L))
            info.setReturnValue("<Bs\u6CB3Gc9YIv#/'rJ\u4DC5fi6:\uC047\u7809\u9352G=`e{UXXwlAJ4khC1f=Lya+e");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_2128065655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128065655L))
            info.setReturnValue("5J");
    }


}
