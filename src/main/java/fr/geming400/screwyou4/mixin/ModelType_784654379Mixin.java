package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenVariant.ModelType.class)
public class ModelType_784654379Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/chicken/ChickenVariant$ModelType;", cancellable = true)
    private static void values__1767872856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767872856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/chicken/ChickenVariant$ModelType;", cancellable = true)
    private static void valueOf__968927579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968927579L))
            info.setReturnValue(net.minecraft.world.entity.animal.chicken.ChickenVariant.ModelType.COLD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__350806093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350806093L))
            info.setReturnValue("'qJ\u2966P\u1066w^!h8A??+^rb8\u69C9(sn8uQ2");
    }


}
