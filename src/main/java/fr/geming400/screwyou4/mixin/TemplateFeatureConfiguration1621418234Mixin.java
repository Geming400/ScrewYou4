package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TemplateFeatureConfiguration.class)
public class TemplateFeatureConfiguration1621418234Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1288036803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1288036803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_485958259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485958259L))
            info.setReturnValue("\u9EF2/\uC68A*N/#\u451D\u86601WfymAwp?o3@P\u337B-Fh0uJh1)hb:tC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1659680976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659680976L))
            info.setReturnValue(-556312102);
    }

    @Inject(at = @At("HEAD"), method = "templates()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void templates_1114934368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114934368L))
            info.setReturnValue(null);
    }


}
