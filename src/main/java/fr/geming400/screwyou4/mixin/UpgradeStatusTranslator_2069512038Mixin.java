package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeStatusTranslator.class)
public class UpgradeStatusTranslator_2069512038Mixin {
        @Inject(at = @At("HEAD"), method = "translate(Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void translate_293981125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293981125L))
            info.setReturnValue(null);
    }


}
