package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.BackgroundMusic.class)
public class BackgroundMusic1328029689Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1581425348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1581425348L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_192569714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192569714L))
            info.setReturnValue("F:^9㹼pi})䢙J?l0\"f%㑳薓b]I6 턎J{,Fj<|⯕E毟=+[닰+3m3UpUodc*h!>?^`.jonC)+X;$*bLbhRCU`臥A`)ၻx;&ZQ.Sk6CL}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1366292431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366292431L))
            info.setReturnValue(1646571086);
    }

    @Inject(at = @At("HEAD"), method = "select(ZZ)Ljava/util/Optional;", cancellable = true)
    private void select_1493665895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493665895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultMusic()Ljava/util/Optional;", cancellable = true)
    private void defaultMusic_1573491111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573491111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "creativeMusic()Ljava/util/Optional;", cancellable = true)
    private void creativeMusic_1573491111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573491111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUnderwater(Lnet/minecraft/sounds/Music;)Lnet/minecraft/world/attribute/BackgroundMusic;", cancellable = true)
    private void withUnderwater_1899707819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899707819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "underwaterMusic()Ljava/util/Optional;", cancellable = true)
    private void underwaterMusic_1573491111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573491111L))
            info.setReturnValue(null);
    }


}
