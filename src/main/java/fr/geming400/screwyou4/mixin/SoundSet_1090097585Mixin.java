package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowSoundVariants.SoundSet.class)
public class SoundSet_1090097585Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/CowSoundVariants$SoundSet;", cancellable = true)
    private static void values__322931894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322931894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/CowSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf__874066835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874066835L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.CowSoundVariants.SoundSet.MOODY);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__45362887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45362887L))
            info.setReturnValue("\u876BH]vK.?(IViPIg\uB46DXOj\u8B60\"xVI%V3\"\uFF9A!F#\u35B2[#,)2$le %0)CDf'E]e}`fp ;0\u3981LRl)8|@cT \u2390,{\u88D7");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier__45362887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45362887L))
            info.setReturnValue("\u876BH]vK.?(IViPIg\uB46DXOj\u8B60\"xVI%V3\"\uFF9A!F#\u35B2[#,)2$le %0)CDf'E]e}`fp ;0\u3981LRl)8|@cT \u2390,{\u88D7");
    }


}
