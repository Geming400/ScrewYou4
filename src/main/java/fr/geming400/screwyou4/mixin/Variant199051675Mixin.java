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
            info.setReturnValue("\u010DO%7&n\u5292FlAT]X*Nd}XUyBeb_,^Xs.an{\u0F23r[\uBACB$gHE$1x,J\uB398M?\uA7110:[f\">n&C,iJoDPZ\uD10B0\u301C\u7D3FJ\u6D9D\u14A5+\u188DI@9Zt\uA029G@*>");
    }


}
