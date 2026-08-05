package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.I18n.class)
public class I18n_288289688Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void get_117276677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117276677L))
            info.setReturnValue("3\u9271k-ZSHioOPww8e4z\u79AC&K\u2EC6X\u296E>Z\u5D54Pf");
    }


}
