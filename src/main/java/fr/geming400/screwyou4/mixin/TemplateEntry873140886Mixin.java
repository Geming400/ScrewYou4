package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TemplateFeatureConfiguration.TemplateEntry.class)
public class TemplateEntry873140886Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__35485382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35485382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1643564411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643564411L))
            info.setReturnValue("IIMI.%'%_*kWO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1430492977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430492977L))
            info.setReturnValue(1508203767);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/feature/configurations/TemplateFeatureConfiguration$TemplateEntry;", cancellable = true)
    private static void of__1341422261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341422261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "template()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void template__1203756969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203756969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotations()Ljava/util/List;", cancellable = true)
    private void rotations__176589573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176589573L))
            info.setReturnValue(null);
    }


}
