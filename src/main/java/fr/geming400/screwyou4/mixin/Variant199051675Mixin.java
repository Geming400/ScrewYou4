package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Salmon.Variant.class)
public class Variant199051675Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private static void values_2064872850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064872850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/fish/Salmon$Variant;", cancellable = true)
    private static void valueOf_1753579051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753579051L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.Salmon.Variant.SMALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_287260297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(287260297L))
            info.setReturnValue("$uGk");
    }


}
