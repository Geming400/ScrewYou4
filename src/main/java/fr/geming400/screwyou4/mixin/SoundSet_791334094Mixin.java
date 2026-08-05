package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariants.SoundSet.class)
public class SoundSet_791334094Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/pig/PigSoundVariants$SoundSet;", cancellable = true)
    private static void values__1574373821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574373821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/pig/PigSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf_190829468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190829468L))
            info.setReturnValue(net.minecraft.world.entity.animal.pig.PigSoundVariants.SoundSet.CLASSIC);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__2127454283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127454283L))
            info.setReturnValue("3>hp%-ndbJ+/>He\u341FtJ\uC1EC-zp^N");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_1295607584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1295607584L))
            info.setReturnValue("ICBK{Vg\u336C2FK%\u5C8AYBon\u1E1B0i\u9871[\"u^{[e\uA393;q.G%;?<JQ91w1\uD2F8Icw\u1B3C]N{\u076CDIt\uC4C6uwN'D\u356A_)s77\u00DC\u81B1NqW,!$Igj@N\u94FE[vB");
    }


}
