package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariants.SoundSet.class)
public class SoundSet_2119515430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/feline/CatSoundVariants$SoundSet;", cancellable = true)
    private static void values_214989272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214989272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/feline/CatSoundVariants$SoundSet;", cancellable = true)
    private static void valueOf_1013934549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013934549L))
            info.setReturnValue(net.minecraft.world.entity.animal.feline.CatSoundVariants.SoundSet.CLASSIC);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Ljava/lang/String;", cancellable = true)
    private void getIdentifier_984054958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984054958L))
            info.setReturnValue("q@Bs&Ihx+!;u\u54A8LXLm\"'.yy`#:hcm@L1Y!4,7PX\uA829.|?=}H[adkZom\u409A4Q*od'\u8637IVUq\uD25Dk\u57F9\u32C7yd]HI+\u632Bx'7w(1<{{G\u0616l#_^Z");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_984054958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984054958L))
            info.setReturnValue("q@Bs&Ihx+!;u\u54A8LXLm\"'.yy`#:hcm@L1Y!4,7PX\uA829.|?=}H[adkZom\u409A4Q*od'\u8637IVUq\uD25Dk\u57F9\u32C7yd]HI+\u632Bx'7w(1<{{G\u0616l#_^Z");
    }


}
