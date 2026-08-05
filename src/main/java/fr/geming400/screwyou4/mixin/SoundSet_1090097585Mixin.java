package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowSoundVariants.SoundSet.class)
public class SoundSet_1090097585Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/CowSoundVariants$SoundSet;", cancellable = true)
    private static void values__1935532308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935532308L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/CowSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf__170329019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170329019L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.CowSoundVariants.SoundSet.CLASSIC);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier__1828690792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828690792L))
            info.setReturnValue("4`2\u32ABe!&?1@y8= \uBA88qzsU0(\u9E63R}_k24F5&h8)i1g?!o:%*}4-.+7nNiCl\u3360]*W)=d:@7ki]7\uA788k))iiDNx8\uB8BB9^R6dUl\u784CRz'h4w2\u0730g");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_1594371075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594371075L))
            info.setReturnValue("$pvO\u94DC\u6018|R\"\u1709m7joi#mb?;`I3\u2816:\u2677/(*C\uC435Gb711c&ag.\uCF50f\u39ED{k^B1\u0CDD");
    }


}
