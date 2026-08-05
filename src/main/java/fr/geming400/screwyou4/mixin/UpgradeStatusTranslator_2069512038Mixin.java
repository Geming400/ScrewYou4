package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeStatusTranslator.class)
public class UpgradeStatusTranslator_2069512038Mixin {
        @Inject(at = @At("HEAD"), method = "translate(Lnet/minecraft/util/worldupdate/UpgradeProgress;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void translate__872863853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872863853L))
            info.setReturnValue(null);
    }


}
