package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowVariant.ModelType.class)
public class ModelType1725439635Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/cow/CowVariant$ModelType;", cancellable = true)
    private static void values_555795419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(555795419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/cow/CowVariant$ModelType;", cancellable = true)
    private static void valueOf_1992897250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1992897250L))
            info.setReturnValue(net.minecraft.world.entity.animal.cow.CowVariant.ModelType.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1813648257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813648257L))
            info.setReturnValue(";=Q4\uC6E3L\uA139^:/\uA8C1\uB7CExn*qA*rFgjm7|\u888ElOEpN)<_nz3IMz0rG\u1887N0}$j{aJ*RZ;");
    }


}
