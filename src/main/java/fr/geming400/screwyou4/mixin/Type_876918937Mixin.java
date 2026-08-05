package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.UndeadHorseRenderer.Type.class)
public class Type_876918937Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/UndeadHorseRenderer$Type;", cancellable = true)
    private static void values_1311678930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311678930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/UndeadHorseRenderer$Type;", cancellable = true)
    private static void valueOf_1778319723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778319723L))
            info.setReturnValue(net.minecraft.client.renderer.entity.UndeadHorseRenderer.Type.ZOMBIE);
    }


}
