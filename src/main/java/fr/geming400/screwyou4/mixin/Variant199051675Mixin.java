package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Salmon.Variant.class)
public class Variant199051675Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private static void values_849348464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849348464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private static void valueOf__1150689197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150689197L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.Salmon.Variant.MEDIUM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__936408796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936408796L))
            info.setReturnValue("čO%7&n劒FlAT]X*Nd}XUyBeb_,^Xs.an{༣r[뫋$gHE$1x,J뎘M?꜑0:[f\">n&C,iJoDPZ턋0〜紿J涝ᒥ+ᢍI@9ZtꀩG@*>");
    }


}
