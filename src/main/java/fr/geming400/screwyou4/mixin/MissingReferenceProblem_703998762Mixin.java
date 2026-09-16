package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.MissingReferenceProblem.class)
public class MissingReferenceProblem_703998762Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__204627507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204627507L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1474422286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474422286L))
            info.setReturnValue("rijrM3h]\u9C6B;Zei\uF9640");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1261350852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261350852L))
            info.setReturnValue(368256699);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__469988946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469988946L))
            info.setReturnValue("Z\uAE920 y\uAE74f@C\uCD4CtOYPf`1hn-ZZb7td;.`|ey(?>b");
    }

    @Inject(at = @At("HEAD"), method = "referenced()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void referenced_154629633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154629633L))
            info.setReturnValue(null);
    }


}
