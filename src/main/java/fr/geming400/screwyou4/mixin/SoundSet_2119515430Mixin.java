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
            info.setReturnValue("q@Bs&Ihx+!;u咨LXLm\"'.yy`#:hcm@L1Y!4,7PX꠩.|?=}H[adkZom䂚4Q*od'蘷IVUq퉝k培㋇yd]HI+挫x'7w(1<{{Gؖl#_^Z");
    }

    @Inject(at = @At("HEAD"), method = "getSoundEventIdentifier()Ljava/lang/String;", cancellable = true)
    private void getSoundEventIdentifier_984054958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984054958L))
            info.setReturnValue("q@Bs&Ihx+!;u咨LXLm\"'.yy`#:hcm@L1Y!4,7PX꠩.|?=}H[adkZom䂚4Q*od'蘷IVUq퉝k培㋇yd]HI+挫x'7w(1<{{Gؖl#_^Z");
    }


}
