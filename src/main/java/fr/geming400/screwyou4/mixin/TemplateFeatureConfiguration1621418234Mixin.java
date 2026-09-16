package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TemplateFeatureConfiguration.class)
public class TemplateFeatureConfiguration1621418234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_712791966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712791966L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1903125537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903125537L))
            info.setReturnValue("9\u149B2`\uC56DDfGV23_Q0A7xu[JdIMJVuU\uCF3B:\uC633&Hm=}&rc$d\u62A1(F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2116196971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2116196971L))
            info.setReturnValue(913899342);
    }

    @Inject(at = @At("HEAD"), method = "templates()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void templates_1703288345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703288345L))
            info.setReturnValue(null);
    }


}
