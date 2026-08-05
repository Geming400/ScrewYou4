package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.MoverType.class)
public class MoverType213637853Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/MoverType;", cancellable = true)
    private static void values__973032678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973032678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/MoverType;", cancellable = true)
    private static void valueOf_1070473569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070473569L))
            info.setReturnValue(net.minecraft.world.entity.MoverType.PISTON);
    }


}
