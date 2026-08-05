package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenVariant.ModelType.class)
public class ModelType_784654379Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/chicken/ChickenVariant$ModelType;", cancellable = true)
    private static void values_757366726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757366726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/chicken/ChickenVariant$ModelType;", cancellable = true)
    private static void valueOf_348977101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348977101L))
            info.setReturnValue(net.minecraft.world.entity.animal.chicken.ChickenVariant.ModelType.COLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_872863000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872863000L))
            info.setReturnValue("'34<4 g\u17E1 \u0691-7\uB0A3N\u3AC99P\u0548\"=nvSZ@YPAhx\uA886eg$zE|E");
    }


}
