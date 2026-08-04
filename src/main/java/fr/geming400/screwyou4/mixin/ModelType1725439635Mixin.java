package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowVariant.ModelType.class)
public class ModelType1725439635Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/CowVariant$ModelType;", cancellable = true)
    private static void values_714779837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714779837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/CowVariant$ModelType;", cancellable = true)
    private static void valueOf__778835526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778835526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_589979164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589979164L))
            info.setReturnValue(null);
    }


}
