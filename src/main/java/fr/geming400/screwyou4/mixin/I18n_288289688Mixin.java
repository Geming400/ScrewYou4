package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.I18n.class)
public class I18n_288289688Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void get_398335259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(398335259L))
            info.setReturnValue("p&J!\u8EAD=6o ..ao1>1[\u53040b<=zF@YHwB#x{;\u5168# \u795Br-:Q'\u9AF4j{./J\u2AB8*?h\u8733*Es\uC58AknEnMZtM?.h/\u15EC\u8BBB? /\"?Xh6\uA322uA\"\uB095)D9");
    }


}
