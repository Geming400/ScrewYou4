package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariants.SoundSet.class)
public class SoundSet1782760889Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariants$SoundSet;", cancellable = true)
    private static void values__1166562015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1166562015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/chicken/ChickenSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf_759964026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759964026L))
            info.setReturnValue(net.minecraft.world.entity.animal.chicken.ChickenSoundVariants.SoundSet.CLASSIC);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__1136027487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136027487L))
            info.setReturnValue("\u7333|1\u915A?`1n%,W=a:\u4E53j0mh1wRci7}Hy,sNz^Di4\u1479");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier__2007932916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007932916L))
            info.setReturnValue("9qJxupCV-ci4N0sX7B%5v<j\u291FGA9Ri^]!(V8(_(,RtUdto!n(.xxs");
    }


}
